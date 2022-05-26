const express = require("express");
const app = express();
const port = 3000;

app.get("/", (req, res) => {
  users = [
    {
      _id: "I0",
      name: "NelsonServer",
      description: "Lorem ipsum ...",
      age: 15,
    },
    {
      _id: "I1",
      name: "JackServer",
      description: "Lorem ipsum ...",
      age: 15,
    },
  ];
  res.send(users);
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
