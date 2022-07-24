# End-points

| Method | End-Point | Description |
| --- | --- | --- |
| POST | /add | Adds a new phonebook |
| POST | /addlist | Adds a list of phonebooks |
| GET | /phonebook | Lists of all phonebooks |
| GET | /phonebook/{id} | Gets a phonebook by id |
| PUT | /update | Updates a phonebook |
| DELETE | /delete/{id} | Deletes a phonebook |

## PhoneBook model

```xml
PhoneBook {
	firstName	string
	lastName	string
	phoneNumber int
}
```

## POST Methods

### `/add`

Adds a new contact.

**Parameter: `object (body)`**

PhoneBook, example value:

```json
{
	"firstName": "Bruno",
	"lastName": "Tattaglia",
	"phoneNumber": 123456789
}
```

### `/addlist`

Adds a list of new contacts.

**Request parameter: `array of objects (body)`**

List of PhoneBook model, example value:

```json
[
	{
		"firstName": "Bruno",
		"lastName": "Tattaglia",
		"phoneNumber": 12345678
	},
	{
		"firstName": "Vito",
		"lastName": "Andolini",
		"phoneNumber": 8767921
	}
]
```

## GET Methods

### `/phonebook`

Get the list of all phonebooks.

**Request parameter: none**

**Response: `array of objects`**

Example:

```json
[
	{
		"id": 1,
		"firstName": "Bruno",
		"lastName": "Tattaglia",
		"phoneNumber": 12345678
	},
	{
		"id": 2,
		"firstName": "Vito",
		"lastName": "Andolini",
		"phoneNumber": 8767921
	}
]
```

### `/phonebook/{id}`

Get a phonebook of the user with a specific id.

**Request parameter: `Phone Book ID (path)`**

**Response: `object`**

Example:

```json
{
	"id": 1,
	"firstName": "Bruno",
	"lastName": "Tattaglia",
	"phoneNumber": 123456789
}
```

## PUT Method

### `/update`

Updates a phonebook. Requests are taken in the body.

**Request parameter: `object (body)`**

Example:

```json
{
	"firstName": "Bruno",
	"lastName": "Tattaglia",
	"phoneNumber": 123456789
}
```

## DELETE Method

### `/delete/{id}`

Deletes a phonebook with a specific id.

**Request parameter: `Phone Book ID (path)`**