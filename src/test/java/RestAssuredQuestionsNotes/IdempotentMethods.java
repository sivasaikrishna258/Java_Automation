package RestAssuredQuestionsNotes;

public class IdempotentMethods {
    /**
     * ✅ What Are Idempotent Methods?
     * In HTTP, an idempotent method is a request that can be called multiple times with the same result, without changing the server state after the first call.
     *
     * 📌 Definition:
     * An HTTP method is idempotent if one request = same effect as many identical requests.
     *
     * | Method    | Idempotent? | Why                                                    |
     * | --------- | ----------- | ------------------------------------------------------ |
     * | `GET`     | ✅ Yes       | Just retrieves data, no change on server               |
     * | `PUT`     | ✅ Yes       | Replaces resource → same input = same result           |
     * | `DELETE`  | ✅ Yes       | Deleting the same resource again has no further effect |
     * | `HEAD`    | ✅ Yes       | Like `GET`, but no response body                       |
     * | `OPTIONS` | ✅ Yes       | Just returns allowed HTTP methods                      |
     * | `POST`  | ❌ No         | Creates a new resource → calling twice creates duplicates |
     * | `PATCH` | ❌ Not always | Can be idempotent depending on implementation             |
     */
}
