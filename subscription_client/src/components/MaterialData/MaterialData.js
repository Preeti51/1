import React from "react";

import img_1 from "../../assets/images/genrestest.jpg";
import img_2 from "../../assets/images/book-cover.png";
import img_3 from "../../assets/images/slidercover7.jpg";

const MaterialData = () => {
  return (
    <React.Fragment>
      <div className="materialData">
        <div className="card">
          <div className="imgBox">
            <img src={img_1} alt="" />
          </div>
          <div className="details">
            <div className="content">
              <h2>Fashion </h2>
              <p>Top Picks:</p>
              <div className="list">
                <ol>
                  <li>Vouge</li>
                  <li>Femina</li>
                  <li>TopModel</li>
                  <li>Ms.Diva</li>
                </ol>
              </div>
            </div>
          </div>
        </div>

        <div className="card">
          <div className="imgBox">
            <img src={img_2} alt="" />
          </div>
          <div className="details">
            <div className="content">
              <h2>Art and Craft </h2>
              <p>Top Picks:</p>
              <div className="list">
                <ol>
                  <li>Vouge</li>
                  <li>Femina</li>
                  <li>TopModel</li>
                  <li>Ms.Diva</li>
                </ol>
              </div>
            </div>
          </div>
        </div>

        <div className="card">
          <div className="imgBox">
            <img src={img_3} alt="" />
          </div>

          <div className="details">
            <div className="content">
              <h2>Asthetics </h2>
              <p>Top Picks:</p>
              <div className="list">
                <ol>
                  <li>Vouge</li>
                  <li>Femina</li>
                  <li>TopModel</li>
                  <li>Ms.Diva</li>
                </ol>
              </div>
            </div>
          </div>
        </div>
      </div>
    </React.Fragment>
  );
};

export default MaterialData;
