import React from "react";

const Directors = () => {
  return (
    <React.Fragment>
      <div className="directors">
        <div className="container">
          <div className="row">
            <h1> Directors </h1>
          </div>
          <div className="column">
            <div className="part-1">
              <div className="image">
                <div className="overlay"></div>
              </div>

              <div className="content">
                <h1>JEN MARONEY</h1>
                <p>CEO</p>

                <button>
                  {" "}
                  <span className="facebook"></span>
                </button>
                <button>
                  {" "}
                  <span className="whatsapp"></span>
                </button>
                <button>
                  {" "}
                  <span className="instagram"></span>
                </button>
                <button>
                  {" "}
                  <span className="linkedin"></span>
                </button>
                <button>
                  {" "}
                  <span className="wikipedia"></span>
                </button>
              </div>
            </div>
            <div className="part-2">
              <div className="image">
                <div className="overlay"></div>
              </div>

              <div className="content">
                <h1>RACHEL GREEN</h1>
                <p>CFO-Technology</p>
                <button>
                  {" "}
                  <span className="facebook"></span>
                </button>
                <button>
                  {" "}
                  <span className="whatsapp"></span>
                </button>
                <button>
                  {" "}
                  <span className="instagram"></span>
                </button>
                <button>
                  {" "}
                  <span className="linkedin"></span>
                </button>
                <button>
                  {" "}
                  <span className="wikipedia"></span>
                </button>
              </div>
            </div>
            <div className="part-3">
              <div className="image">
                <div className="overlay"></div>
              </div>
              <div className="thumb"></div>
              <div className="content">
                <h1>SARAH ROBERT</h1>
                <p>Business Director</p>
                <button>
                  {" "}
                  <span className="facebook"></span>
                </button>
                <button>
                  {" "}
                  <span className="whatsapp"></span>
                </button>
                <button>
                  {" "}
                  <span className="instagram"></span>
                </button>
                <button>
                  {" "}
                  <span className="linkedin"></span>
                </button>
                <button>
                  {" "}
                  <span className="wikipedia"></span>
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </React.Fragment>
  );
};

export default Directors;
