'use strict';

const express = require('express');

// Constants
const PORT = process.env.PORT || 8081; // Change the port to 8081
const HOST = '0.0.0.0';

// App
const app = express();
app.get('/', (req, res) => {
    res.send('Roberto says "Hello DevOps FS2023!"');
});

app.listen(PORT, HOST);
console.log(`Running on http://${HOST}:${PORT}`);
