import React from "react";

const SignUp = () => {
  const setError = (id, error) => {
    document.getElementById(id).value = "";
    document.getElementById(id).placeholder = `* ${error}`;
    document.getElementById(id).style.border = "2px solid red";

    return false;
  };

  // const setCorrect = (id,data) => {
  //     //clear all the values and change the text of login register to hi! user.
  //     return false;
  // }

  const validate = () => {
    // var username=document.getElementById("username").value
    var password = document.getElementById("pass").value;
    var name = document.getElementById("name2").value;
    var mobile = document.getElementById("mobile").value;
    var age = document.getElementById("age").value;
    // var favbook=document.getElementById('favbook').value

    // var letters = /^[A-Za-z]+$/;

    if (name.length < 6) {
      setError("name2", "Enter valid name");
    }

    if (age < 13) {
      setError("age", "You are too young for this!");
    }
    if (mobile.length < 10 || mobile.length > 10) {
      setError("mobile", "Enter correct mobile no.");
    }
    if (password.length < 6) {
      setError("pass", "password too short");

      // result= false;
    }

    return false;
  };

  return (
    <React.Fragment>
      <div className="forms">
        <h1>ENTER YOUR DETAILS</h1>
        <form className="box" action="signup.html" method="POST">
          <div className="words">
            <label htmlFor="name">Name</label>
            <label htmlFor="age">Age</label>
            <label htmlFor="mobile">Mobile no.</label>

            <label htmlFor="Username">Username</label>
            <label htmlFor="pass">Password</label>
            <label htmlFor="favbook">Fav Magazine</label>
          </div>
          <div className="details">
            <input
              type="text"
              id="name2"
              name="name"
              value=""
              placeholder="Your Name"
              required
            />
            <input
              type="number"
              id="age"
              name="age"
              value=""
              placeholder="Your age"
              required
            />
            <input
              type="number"
              id="mobile"
              name="mobile"
              value=""
              placeholder="Contact info"
              required
            />
            <input
              type="email"
              id="username"
              name="username"
              value=""
              placeholder=" someone@example.com"
              required
            />
            <input
              type="password"
              id="pass"
              name="pass"
              value=""
              placeholder="#123Aws"
              required
            />
            <textarea
              name="favbook"
              id="favbook"
              cols="19"
              rows="4"
              placeholder="Sportstar.."
            ></textarea>
            <span>
              <input
                type="submit"
                name=""
                value="Sign up"
                id="SignUpBut"
                onClick={validate}
              />
            </span>
          </div>
        </form>
      </div>
    </React.Fragment>
  );
};

export default SignUp;
