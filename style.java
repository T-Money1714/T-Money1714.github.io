/* Fonts & general styles */
body {
  font-family: 'Roboto', sans-serif;
  background-color: #f4f4f9;
  color: #333;
  margin: 0;
  padding: 0;
  line-height: 1.6;
}

/* Header */
header {
  background-color: #4a90e2;
  color: white;
  text-align: center;
  padding: 50px 20px;
}

.profile-img {
  width: 120px;
  height: 120px;
  border-radius: 50%;
  border: 3px solid white;
  margin-bottom: 20px;
}

header h1 {
  margin: 0;
  font-size: 2.5rem;
}

header p {
  font-size: 1.2rem;
}

/* Navigation */
nav {
  display: flex;
  justify-content: center;
  background-color: #333;
}

nav a {
  color: white;
  text-decoration: none;
  padding: 15px 25px;
  display: inline-block;
  transition: background 0.3s;
}

nav a:hover {
  background-color: #4a90e2;
}

/* Sections */
section {
  background-color: white;
  margin: 30px auto;
  padding: 40px;
  max-width: 900px;
  border-radius: 10px;
  box-shadow: 0px 4px 12px rgba(0,0,0,0.1);
  text-align: center;
}

/* Buttons */
button {
  background-color: #4a90e2;
  color: white;
  border: none;
  padding: 12px 25px;
  font-size: 16px;
  cursor: pointer;
  border-radius: 5px;
  transition: background-color 0.3s ease;
}

button:hover {
  background-color: #357ab8;
}

/* Skills section */
.skills-container {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 15px;
  margin-top: 20px;
}

.skill {
  background-color: #4a90e2;
  color: white;
  padding: 10px 20px;
  border-radius: 5px;
  font-weight: bold;
}

/* Footer */
footer {
  background-color: #333;
  color: white;
  text-align: center;
  padding: 20px;
  margin-top: 30px;
}
