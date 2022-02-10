import jsonPlaceholder from "../apis/jsonPlaceholder";

export const create_appointment = (appointment) => async (dispatch) => {
  console.log(appointment);
  const response = await jsonPlaceholder
    .post("/appointment", appointment)
    .then((res) => console.log(res));

  dispatch({ type: "CREATE_POST", payload: response });
};

export const fetch_appointment = (date) => async (dispatch) => {
  console.log(date);
  const response = await jsonPlaceholder
    .post(`/appointment?date=${date}`)
    .then((res) => console.log(res));

  dispatch({ type: "FETCH_POST", payload: response });
};
