# custom-json-deserializer

### Description:
This is a sample code to convert a json with fields that has the same prefix and transform in a map of this attributes.

### Sample:

Input
```json
{
   "code": "string",
   "first_common_Promocao": "string",
   "first_common_Tipo": "string",
   "first_common_Uso": "string", 
   "first_common_Valor": "string",
   "name": "string",
   "second_common_Color": "string",
   "second_common_Flavor": "string",
   "second_common_Gender": "string",
   "second_common_Size": "string"
 }
```

 Output
```json
 {
  "code": "string",
  "name": "string",
  "attributesFirst": {
    "Uso": "string",
    "Promocao": "string",
    "Tipo": "string",
    "Valor": "string"
  },
  "attributesSecond": {
    "Size": "string",
    "Color": "string",
    "Gender": "string",
    "Flavor": "string"
  }
}
```
