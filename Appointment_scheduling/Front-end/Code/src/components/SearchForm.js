import { Button, Card, Form, ThemeProvider } from "react-bootstrap";
import { useState, useEffect } from "react";
import DataTable from "./DataTable";
import { fetch_appointment } from "../actions";
import { connect } from "react-redux";
import axios from "axios";
const SearchForm = () => {
  const sampleData = [
    {
      id: "123",
      names: "Carlos Perez",
      time: "8:00a.m.",
    },
    {
      id: "456",
      names: "Dilia Ortiz",
      time: "9:00a.m.",
    },
    {
      id: "789",
      names: "Julio Garcia",
      time: "9:30a.m.",
    },
    {
      id: "1010",
      names: "Cecilia Pava",
      time: "10:00a.m.",
    },
  ];

  const [data, setData] = useState([{}]);
  const [q, setQ] = useState("");
  const handleDateChange = (e) => setQ(e.target.value);
  const fetch_info = async () => {
    await axios
      .get(`http://localhost:8080/appointment?date=${q.replaceAll("-", "")}`)
      .then((res) => {
        setData(clean_data(res.data));
      });
  };
  useEffect(fetch_info, []);

  const clean_data = (raw_data) => {
    let temp_data = [];

    raw_data.forEach((element) => {
      temp_data = [
        ...temp_data,
        {
          id: element.user.id,
          names: element.user.name + " " + element.user.lastName,
          time: element.date.substring(11, 16),
        },
      ];
    });
    return temp_data;
  };
  return (
    <div className="App">
      <header className="App-header">
        <Card>
          <Card.Body>
            <Card.Title>Búsqueda de citas</Card.Title>
            <Card.Text>
              Seleccione una fecha y oprima el botón para realizar la búsqueda
            </Card.Text>
            <Form>
              <Form.Group>
                <Form.Label>Fecha</Form.Label>
                <Form.Control
                  type="date"
                  placeholder="Ingresa una fecha"
                  onChange={handleDateChange}
                ></Form.Control>
              </Form.Group>
              <Button onClick={fetch_info} type="button">
                Buscar
              </Button>
            </Form>
            <div>El filtro va aquí</div>
            <div>
              <DataTable data={data} />
            </div>
          </Card.Body>
        </Card>
      </header>
    </div>
  );
};
const mapStateToProps = (state) => {
  return { posts: state.posts };
};

export default connect(mapStateToProps, { fetch_appointment })(SearchForm);
/*<div>
              <DataTable data={data} />
            </div>*/
