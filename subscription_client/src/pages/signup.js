import React from "react";
import { Header, Slider } from "../components";
import { SignUp } from "../containers";

const signup = () => {
  return (
    <React.Fragment>
      <Header />
      <Slider />
      <SignUp />
    </React.Fragment>
  );
};

export default signup;
