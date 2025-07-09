package RestAssuredQuestionsNotes;

public class differenceBetweenGraphQlAndRest {

    /**
     * | Operation | REST              | GraphQL                                |
     * | --------- | ----------------- | -------------------------------------- |
     * | Read      | `GET /users/1`    | `query { user(id: "1") { ... } }`      |
     * | Create    | `POST /users`     | `mutation { createUser(...) { ... } }` |
     * | Update    | `PUT /users/1`    | `mutation { updateUser(...) { ... } }` |
     * | Delete    | `DELETE /users/1` | `mutation { deleteUser(...) { ... } }` |

     mutation means
     */

    //🔍 What is GraphQL?
    //✅ GraphQL is a query language and runtime for APIs, developed by Facebook, that lets clients ask exactly for the data they need — no more, no less.
    //It's an alternative to REST APIs that offers more flexibility and efficiency.


   /** 🔄 What is a Mutation in GraphQL?
    In GraphQL, a mutation is used to modify server-side data — like:

    Creating a new record

    Updating existing data

    Deleting an item

    It’s similar to:

    POST, PUT, DELETE in REST APIs
*/

}
