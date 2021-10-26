import React from "react";
import Why from "../../assets/images/why.png";

export default function ChooseUs() {
  return (
    <React.Fragment>
      <div className="why-choose-us">
        <div className="container">
          <div className="row">
            <h2>Our USP</h2>
          </div>
          <div className="column">
            <div className="details">
              <div className="part-1">
                <h1>Best Prices</h1>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Repellendus, quaerat beatae nulla.
                </p>
              </div>
              <div className="part-2">
                <h1>High Reviews</h1>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Repellendus, quaerat beatae nulla.
                </p>
              </div>
              <div className="part-3">
                <h1>Fastest Delivery</h1>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Repellendus, quaerat beatae nulla.
                </p>
              </div>
              <div className="part-4">
                <h1>User based</h1>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Repellendus, quaerat beatae nulla.
                </p>
              </div>
            </div>
            <div className="images">
              <img src={Why} alt="" />
            </div>
          </div>
        </div>
      </div>
    </React.Fragment>
  );
}
