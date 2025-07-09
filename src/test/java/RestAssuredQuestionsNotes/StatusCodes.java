package RestAssuredQuestionsNotes;

public class StatusCodes
{
    /**
     * | Code | Meaning              | Common Cause                          |
     * | ---- | -------------------- | ------------------------------------- |
     * | 400  | Bad Request          | Invalid input or malformed JSON       |
     * | 401  | Unauthorized         | Missing or invalid auth token         |
     * | 403  | Forbidden            | Valid token, but no permission        |
     * | 404  | Not Found            | Endpoint or resource doesn’t exist    |
     * | 405  | Method Not Allowed   | Using `POST` on a `GET`-only endpoint |
     * | 409  | Conflict             | Duplicate entry or version conflict   |
     * | 422  | Unprocessable Entity | Valid format but semantically wrong   |
     * |429   |Too many requests     | high number of requests               |
     */

    /**
     * | Code | Meaning               | Common Cause                              |
     * | ---- | --------------------- | ----------------------------------------- |
     * | 500  | Internal Server Error | Unhandled server exception                |
     * | 502  | Bad Gateway           | Server got invalid response from upstream |
     * | 503  | Service Unavailable   | Server is down or overloaded              |
     * | 504  | Gateway Timeout       | Server took too long to respond           |
     */
}
