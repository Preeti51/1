import React from "react";

const LogIn = () => {
  const setError = (id, error) => {
    document.getElementById(id).value = "";
    document.getElementById(id).placeholder = `* ${error}`;
    document.getElementById(id).style.border = "2px solid red";

    return false;
  };

  // eslint-disable-next-line no-unused-vars
  const setCorrect = (id, data) => {
    //clear all the values and change the text of login register to hi! user.
    return false;
  };

  const loginValidate = () => {
    var name = document.getElementById("name1").value;
    var pass = document.getElementById("pass").value;

    if (name === "admin@example.com" && pass === "xyz123") {
      return setCorrect("correctLogin", "signin correct");
    } else if (name === "admin@example.com" && pass !== "xyz123") {
      return setError("pass", "Incorrect");
    } else if (name !== "admin@example.com" && pass === "xyz123") {
      return setError("name1", "Incorrect");
    } else {
      return setCorrect("name1", "Login Correct");
    }
  };

  return (
    <React.Fragment>
      <div className="container">
        <div className="forms">
          <h1>LOGIN DETAILS</h1>

          <form className="box" action="loginpage.html" method="POST">
            <label htmlFor="name">Username</label>
            <input
              type="text"
              id="name1"
              name="name"
              value=""
              placeholder="admin@avizva"
              required
            />

            <label htmlFor="pass">password</label>
            <input
              type="password"
              id="pass"
              name="pass"
              value=""
              placeholder="123abc"
              required
            />
            <span id="correctLogin"> </span>

            <input
              type="submit"
              name=""
              value="Login"
              id="logInBut"
              onClick={loginValidate}
            />
          </form>

          <a href="./signup.html">
            {" "}
            <button>Sign Up</button>
          </a>
        </div>
      </div>
    </React.Fragment>
  );
};

export default LogIn;
