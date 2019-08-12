package com.myspring.xml;

import com.myspring.BeanDefinition;
import com.myspring.PropertyValue;
import com.myspring.io.ResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-11 12:20
 */
public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader{

    public XmlBeanDefinitionReader(ResourceLoader resourceLoader){
        super(resourceLoader);
    }

    @Override
    public void loadBeanDefinitions(String location) throws Exception {
        InputStream inputStream = getResourceLoader().getResource(location).getInputStream();
        doLoadBeanDefinitions(inputStream);
    }

    protected void doLoadBeanDefinitions(InputStream inputStream) throws Exception{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(inputStream);

        registerBeanDefinitions(document);
        inputStream.close();
    }

    public void registerBeanDefinitions(Document document){
        Element element = document.getDocumentElement();
        parseBeanDefinitions(element);
    }

    protected void parseBeanDefinitions(Element element){
        NodeList nodeList = element.getChildNodes();
        for(int i=0; i<nodeList.getLength(); i++){
            Node node = nodeList.item(i);
            if(node instanceof Element){
                Element element1 = (Element) node;
                processBeanDefinition(element1);
            }
        }
    }

    protected void processBeanDefinition(Element element){
        String name = element.getAttribute("name");
        String classname = element.getAttribute("class");
        BeanDefinition beanDefinition = new BeanDefinition();
        processProperty(element, beanDefinition);
        beanDefinition.setObjectClassName(classname);
        getRegistry().put(name, beanDefinition);
    }

    private void processProperty(Element element, BeanDefinition beanDefinition){
        NodeList propertyNodes = element.getElementsByTagName("property");
        for(int i=0; i<propertyNodes.getLength(); i++){
            Node node = propertyNodes.item(i);
            if(node instanceof Element){
                Element element1 = (Element)node;
                String name = element1.getAttribute("name");
                String value = element1.getAttribute("value");
                beanDefinition.getPropertyValues().addPropertyValue(new PropertyValue(name, value));
            }
        }
    }

}
