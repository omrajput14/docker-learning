const express = require('express');
const app = express();
const port = 3000;

app.get('/', (req, res) => {
  res.send('Hello, Docker from Node.js!');
});

app.listen(port, () => {
  console.log(`Node app listening on port ${port}`);
});
