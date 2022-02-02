import React, { useState } from "react";
import {Button, Card, Form} from "react-bootstrap";

// const {useState} = React;

const RecordForm = () => {
    const booking = {
        "id":"",
        "names":"",
        "lastNames":"",
        "age":0,
        "date":"",
        "time":""
    }

    const [id, setId] = useState(1000875632);
    const [names, setNames] = useState("Nombre1 Nombre2")
    const [lastNames, setLastNames] = useState("LastName1 LastName2");
    const [age, setAge] = useState(0);
    const [date, setDate] = useState("1/1/2022");
    const [time, setTime] = useState("10:00PM");
    const handleIdChange = (e) => setId(e.target.value);
    const handleNamesChange = (e) => setNames(e.target.value);
    const handleLastNamesChange = (e) => setLastNames(e.target.value);
    const handleAgeChange = (e) => setAge(e.target.value);
    const handleDateChange = (e) => setDate(e.target.value);
    const handleTimeChange = (e) => setTime(e.target.value);

    booking.id = id;
    booking.names = names;
    booking.lastNames = lastNames;
    booking.age = age;
    booking.date = date;
    booking.time = time;

    return (
        <div className="App">
            <header className="App-header">
                <Card>
                    <Card.Body>
                        <Card.Title>Agendamiento de citas</Card.Title>
                        <Card.Text>Llene todos los campos a continuación y oprima el botón para agendar su cita</Card.Text>
                        <Form>
                            <Form.Group>
                                <Form.Label>Cédula</Form.Label>
                                <Form.Control type="number" placeholder="Ingresa tu numero de cédula" onChange={handleIdChange}/>
                            </Form.Group>
                            <Form.Group>
                                <Form.Label>Nombres</Form.Label>
                                <Form.Control type="text" placeholder="Ingresa tus nombres" onChange={handleNamesChange}/>
                            </Form.Group>
                            <Form.Group>
                                <Form.Label>Apellidos</Form.Label>
                                <Form.Control type="text" placeholder="Ingresa tus apellidos" onChange={handleLastNamesChange}/>
                            </Form.Group>
                            <Form.Group>
                                <Form.Label>Edad</Form.Label>
                                <Form.Control type="number" placeholder="Ingresa tu edad" onChange={handleAgeChange}/>
                            </Form.Group>
                            <Form.Group>
                                <Form.Label>Fecha</Form.Label>
                                <Form.Control type="date" placeholder="Ingresa la fecha para agendar" onChange={handleDateChange}/>
                            </Form.Group>
                            <Form.Group>
                                <Form.Label>Hora</Form.Label>
                                <Form.Control type="time" placeholder="Ingresa la hora para agendar" onChange={handleTimeChange}/>
                            </Form.Group>
                            <Button type="button" onClick={() => {console.log(booking)}}>Registrar</Button> {/* Cambiar el type por submit una vez se quite el console.log() */}
                        </Form>
                    </Card.Body>
                </Card>
            </header>
        </div>
    );
}

export default RecordForm;