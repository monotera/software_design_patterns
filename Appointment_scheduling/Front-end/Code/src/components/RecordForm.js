import axios from "axios";
import React, { useState } from "react";
import { Button, Card, Form } from "react-bootstrap";
import { connect } from "react-redux";
import { create_appointment } from "../actions";
const RecordForm = (props) => {
  const appointment = {
    date: "",
    user: {
      id: "",
      name: "",
      lastName: "",
      age: 0,
    },
  };

  const [id, setId] = useState(1000875632);
  const [names, setNames] = useState("Nombre1 Nombre2");
  const [lastNames, setLastNames] = useState("LastName1 LastName2");
  const [age, setAge] = useState(0);
  const [date, setDate] = useState("1/1/2022");
  const [time, setTime] = useState("10:00");
  const handleIdChange = (e) => setId(e.target.value);
  const handleNamesChange = (e) => setNames(e.target.value);
  const handleLastNamesChange = (e) => setLastNames(e.target.value);
  const handleAgeChange = (e) => setAge(e.target.value);
  const handleDateChange = (e) => setDate(e.target.value);
  const handleTimeChange = (e) => setTime(e.target.value);

  appointment.user.id = id;
  appointment.user.name = names;
  appointment.user.lastName = lastNames;
  appointment.user.age = age;
  appointment.date = date;
  const send_info = async () => {
    appointment.date += `T${time}`;
    console.log(appointment.date);
    await props.create_appointment(appointment);
    alert("Cita creada");
    window.location.reload(false);
  };

  return (
    <div className="App">
      <header className="App-header">
        <Card>
          <Card.Body>
            <Card.Title>Agendamiento de citas</Card.Title>
            <Card.Text>
              Llene todos los campos a continuación y oprima el botón para
              agendar su cita
            </Card.Text>
            <Form>
              <Form.Group>
                <Form.Label>Cédula</Form.Label>
                <Form.Control
                  type="number"
                  placeholder="Ingresa tu numero de cédula"
                  onChange={handleIdChange}
                />
              </Form.Group>
              <Form.Group>
                <Form.Label>Nombres</Form.Label>
                <Form.Control
                  type="text"
                  placeholder="Ingresa tus nombres"
                  onChange={handleNamesChange}
                />
              </Form.Group>
              <Form.Group>
                <Form.Label>Apellidos</Form.Label>
                <Form.Control
                  type="text"
                  placeholder="Ingresa tus apellidos"
                  onChange={handleLastNamesChange}
                />
              </Form.Group>
              <Form.Group>
                <Form.Label>Edad</Form.Label>
                <Form.Control
                  type="number"
                  placeholder="Ingresa tu edad"
                  onChange={handleAgeChange}
                />
              </Form.Group>
              <Form.Group>
                <Form.Label>Fecha</Form.Label>
                <Form.Control
                  type="date"
                  placeholder="Ingresa la fecha para agendar"
                  onChange={handleDateChange}
                />
              </Form.Group>
              <Form.Group>
                <Form.Label>Hora</Form.Label>
                <Form.Control
                  type="text"
                  placeholder="Ingresa la hora para agendar"
                  onChange={handleTimeChange}
                />
              </Form.Group>
              <Button type="button" onClick={send_info}>
                Registrar
              </Button>{" "}
              {/* Cambiar el type por submit una vez se quite el console.log() */}
            </Form>
          </Card.Body>
        </Card>
      </header>
    </div>
  );
};

export default connect(null, { create_appointment })(RecordForm);
