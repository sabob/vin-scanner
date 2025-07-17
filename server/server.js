// server/server.js
const express = require('express');
const path = require('path');

const app = express();
const port = 7070; // The port you want to run your frontend server on

// Serve static files from the directory where index.html is located
// This assumes index.html is in the parent directory of 'server'
app.use(express.static(path.join(__dirname, '..')));

// Optional: Fallback for root path to serve index.html directly
// This ensures that if you go to http://localhost:7070/, it serves index.html
app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, '..', 'index.html'));
});

app.listen(port, () => {
  console.log(`Frontend server running at http://localhost:${port}`);
  console.log(`Open your browser to: http://localhost:${port}`);
});
