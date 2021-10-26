import React from "react";
import { Header, Slider, ChooseUs, Footer } from "../components";
import Counter from "../containers/Counter/Counter";

const home = () => {
  return (
    <React.Fragment>
      {/* <h2>Home</h2> */}
      <Header />
      <Slider />
      <ChooseUs />
      <Counter />
      <Footer />
    </React.Fragment>
  );
};

export default home;
