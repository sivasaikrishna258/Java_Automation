package com.InterviewQueWithCollectionFramework.exceptions;


/**
 * | **Exception**                      | **When It Happens**                                | **How to Fix It**                                                                      |
 * | ---------------------------------- | -------------------------------------------------- | -------------------------------------------------------------------------------------- |
 * | `NoSuchElementException`           | Element not found in the DOM                       | - Use `WebDriverWait` with `ExpectedConditions`<br>- Check locator correctness         |
 * | `ElementNotInteractableException`  | Element is hidden, disabled, or off-screen         | - Wait for element to be visible or enabled<br>- Scroll into view if needed            |
 * | `TimeoutException`                 | Wait times out before condition is met             | - Increase timeout duration<br>- Ensure condition is valid and reachable               |
 * | `StaleElementReferenceException`   | Element is detached from the DOM                   | - Re-locate the element before interaction<br>- Use fresh find before each action      |
 * | `ElementClickInterceptedException` | Another element overlays the target element        | - Wait for modals/loaders to disappear<br>- Scroll or click via JavaScript as fallback |
 * | `NoSuchWindowException`            | Trying to switch to a closed or nonexistent window | - Verify the window handle is valid<br>- Use `getWindowHandles()` to switch safely     |
 * | `NoSuchFrameException`             | Frame ID/name/index is incorrect                   | - Ensure frame exists and is loaded<br>- Locate frame WebElement before switching      |
 * | `InvalidSelectorException`         | Selector syntax is incorrect                       | - Validate your XPath or CSS syntax<br>- Avoid complex, unstable selectors             |
 * | `SessionNotFoundException`         | Session is deleted or never started                | - Ensure WebDriver is properly initialized<br>- Avoid using closed sessions            |
 * | `WebDriverException`               | Catch-all for unknown errors                       | - Look at the full stack trace<br>- Check browser/driver compatibility                 |
 */
public class SeleniumExceptions {

}
