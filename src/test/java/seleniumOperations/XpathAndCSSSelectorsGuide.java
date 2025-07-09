package seleniumOperations;

/**
 * | **Use Case**                          | **XPath**                                     | **CSS Selector**                     |
 * | ------------------------------------- | --------------------------------------------- | ------------------------------------ |
 * | **Tag only**                          | `//input`                                     | `input`                              |
 * | **By ID**                             | `//*[@id='username']`                         | `#username`                          |
 * | **By class**                          | `//*[@class='form-control']`                  | `.form-control`                      |
 * | **By multiple classes**               | `//*[contains(@class, 'btn primary')]`        | `.btn.primary` *(no space!)*         |
 * | **By attribute**                      | `//input[@name='email']`                      | `input[name='email']`                |
 * | **Multiple attributes**               | `//input[@type='text'][@name='email']`        | `input[type='text'][name='email']`   |
 * | **Starts-with attribute**             | `//input[starts-with(@id, 'user')]`           | ❌ Not supported directly             |
 * | **Contains attribute**                | `//input[contains(@name, 'email')]`           | `input[name*='email']`               |
 * | **Ends-with attribute**               | ❌ XPath 1.0 doesn't support this              | `input[name$='email']`               |
 * | **Exact text match**                  | `//button[text()='Login']`                    | ❌ Not supported                      |
 * | **Partial text match**                | `//button[contains(text(), 'Log')]`           | ❌ Not supported                      |
 * | **Parent → child**                    | `//div/input`                                 | `div input`                          |
 * | **Direct child only**                 | `//div/input`                                 | `div > input`                        |
 * | **Nth child**                         | `(//input)[2]`                                | `input:nth-of-type(2)`               |
 * | **Child to parent**                   | `//input/..`                                  | ❌ Not supported                      |
 * | **Ancestor element**                  | `//input/ancestor::form`                      | ❌ Not supported                      |
 * | **Preceding sibling**                 | `//label/preceding-sibling::input`            | ❌ Not supported                      |
 * | **Following sibling**                 | `//label/following-sibling::input`            | `label + input` *(immediate only)*   |
 * | **Attribute equals (case-sensitive)** | `//input[@value='Submit']`                    | `input[value='Submit']`              |
 * | **Element with OR condition**         | `//input[@id='username' or @name='user']`     | `input#username, input[name='user']` |
 * | **All elements with attribute**       | `//*[@name]`                                  | `*[name]`                            |
 * | **Element with text() and attribute** | `//button[@type='submit' and text()='Login']` | ❌ Not supported (no `text()` in CSS) |
 * | **Universal selector** (any element)  | `//*`                                         | `*`                                  |
 */
public class XpathAndCSSSelectorsGuide {

}
