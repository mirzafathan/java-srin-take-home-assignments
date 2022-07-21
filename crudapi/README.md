## 📌 End-points

| Method   | End-Point         | Description              |
|----------|-------------------|--------------------------|
| `POST`   | `/add`            | Add a new phonebook      |
| `POST`   | `/addlist`        | Add a list of phonebooks |
| `GET`    | `/phonebook`      | List of all phonebooks   |
| `GET`    | `/phonebook/{id}` | Get a phonebook by id    |
| `PUT`    | `/update`         | Update a phonebook       |
| `DELETE` | `/delete/{id}`    | Delete a phonebook       |

POST and PUT inputs are from request body. Phone number needs to be under the limit of int data type in Java. Personally I would prefer another data type.