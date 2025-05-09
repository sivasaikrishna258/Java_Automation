package seleniumOperations;

/**
 * child::	Selects direct children of the node	//ul/child::li — selects <li> children of <ul>
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * ✅ All XPath Axes
 * Axis	                            Description	                                                        Example
 * self::	                    Selects the current node	                            //div/self::div — selects the current <div>
 * child::	                Selects direct children of the node	                        //ul/child::li — selects <li> children of <ul>
 * parent::	                Selects the parent of the node	                            //span/parent::div — selects parent <div> of <span>
 * ancestor::	            Selects all ancestors (parent, grandparent, etc.)	        //em/ancestor::div — selects all ancestor <div>s of <em>
 * ancestor-or-self::	    Selects all ancestors + self	                            //em/ancestor-or-self::em — includes current <em>
 * descendant::	            Selects all descendants (child, grandchild, etc.)	        //div/descendant::span — all <span> inside <div>
 * descendant-or-self::	    Selects self and all descendants	                        //div/descendant-or-self::div — current and nested <div>s
 * following::	            All nodes after the current node in document order	        //h2/following::p — all <p> after <h2>
 * following-sibling::	    All sibling nodes after the current node	                //li[@id='first']/following-sibling::li
 * preceding::	            All nodes before the current node in document order	        //h2/preceding::div — all <div>s before <h2>
 * preceding-sibling::	    All siblings before the current node	                    //li[@id='last']/preceding-sibling::li
 * attribute::	            Selects attributes of the node	                            //a/attribute::href
 * namespace::	            Selects namespaces (rarely used in HTML)	                Used in XML namespaces
 */

public class SiblingsDemo {
    public static void main(String[] args) {

        //for selecting the checkbox based on the section name and the value inside the section from amazon sidebar

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.findElement(By.xpath("//span[text()=\"Discount\"]/ancestor::div[@role=\"group\"]/descendant::span[text()=\"10% Off or more\"]")).click();
    }
}
/** example for descendant and ancestor
 * if u want to refer to immediate parent or child use parent:: or child::because it only step back once if u use parent:: and step down once in the case of child::
 * for example u have a block and u want to step down to all the elements and select one element based on text or attribute within the block
    then use descendant:: and use the number ,text or attribute u want . eg:
   number - //span/descendant::div[2] - it will get 2nd div element within span
   text - //span/descendant::div[text()="text"] - it will get div element with given text within span
 * same is applicable to ancestor:: - it will give all the relatives just not with in the block i would say for the root node.from there u have to filter by text or attribute or number
 */

/** example for following and preceding sibling
 * let think of this way that we have below li tags
 * <ul>
 * <li>text1</li>
 * <li>text2</li>
 * <li>text3</li>
 * <li>text4</li>
 * <li>text5</li>
 * <li>text6</li>
 * <li>text7</li>
 * </ul>

 //ul/li[text()=text4]/forward-sibling::li] --- it gives the all the li elements after "li" tag with "text4" like "text5","text6","text7"

 //ul/li[text()=text4]/preceding-sibling::li] --- it gives the all the li elements before "li" tag with "text4" like "text1","text2","text3"
 */