package RestAssuredQuestionsNotes;

public class Notes {

    // how to validate json response when json structure is dynamic in rest assured

    /**
     * ✅ Common Techniques for Validating Dynamic JSON in Rest Assured
     * ✅ 1. Use JsonPath and Traverse Dynamically
     * ✅ 2. Conditional Assertions Based on Key Presence
     * if (data.containsKey("status")) {
     *     assertEquals("success", data.get("status"));
     * }
     *
     * and also we can use object mapper to convert to tree like structure to traverse the json dynamically
     */

    //* difference bwetween JWT and Bearer token
   /**      | Feature        | JWT                           | Bearer Token                     |
            | -------------- | ----------------------------- | -------------------------------- |
            | What is it?    | Token format (self-contained) | Way to send a token (in headers) |
            | Contains data? | ✅ Yes (e.g., user ID, role)   | ❌ No (just wraps the token)    |
            | Typical use    | Auth, session, API security   | HTTP header for sending tokens   |
            | Common pairing | Bearer token = JWT            | Bearer token can be JWT or other |
*/
}
/**
 * 🧪 How They Work
 * 🔸 OAuth 1.0 Flow (simplified)
 * Client gets a request token.
 *
 * User logs in and authorizes.
 *
 * Server sends an access token + secret.
 *
 * Each API request must be signed using token, secret, and nonce.
 *
 * ⚠️ More secure without HTTPS, but very complex to implement.
 /****************************************************************************

 * 🔸 OAuth 2.0 Flow (simplified)
 * Client redirects user to login.
 *
 * User logs in and authorizes.
 *
 * Client receives an access token.
 *
 * API requests use:
 */

//Exactly — you're right! ✅
//
//The reason we use import static in Java is to allow calling static methods or variables without qualifying them with their class name.

/**
✅ When to Use JsonNode vs POJO:
        Use Case	                            Use JsonNode	Use POJO
        JSON is dynamic or changes frequently	✅ Yes	        ❌ No
        You need full type safety	            ❌ No	        ✅ Yes
        JSON structure is deeply nested	        ✅ Yes	        ✅ Yes
        You only need to extract a few fields	✅ Yes	        ❌ Overkill

*/



