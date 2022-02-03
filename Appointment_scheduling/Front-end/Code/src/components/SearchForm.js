import {Button, Card, Form} from "react-bootstrap";
import {useState, useEffect} from "react";
import DataTable from "./DataTable";

const SearchForm = () => {
    const sampleData = [
        {
            "id":"123",
            "names":"Carlos Perez",
            "time":"8:00a.m."
        },
        {
            "id":"456",
            "names":"Dilia Ortiz",
            "time":"9:00a.m."
        },
        {
            "id":"789",
            "names":"Julio Garcia",
            "time":"9:30a.m."
        },
        {
            "id":"1010",
            "names":"Cecilia Pava",
            "time":"10:00a.m."
        }
    ];

    const [data, setData] = useState([]);
    const [q, setQ] = useState("");

    useEffect(() => {
        fetch({/* Aquí va la URI del endpoint que devuelve los datos que se muestran en la tabla */}) 
            .then((response) => response.json())
            .then((json) => setData(json)); {/* Fetch() con funciones anidadas para poder recibir datos de un API remoto */}
    }, []);

    return (
        <div className="App">
            <header className="App-header">
                <Card>
                    <Card.Body>
                        <Card.Title>Búsqueda de citas</Card.Title>
                        <Card.Text>Seleccione una fecha y oprima el botón para realizar la búsqueda</Card.Text>
                        <Form>
                            <Form.Group>
                                <Form.Label>Fecha</Form.Label>
                                <Form.Control type="date" placeholder="Ingresa una fecha"></Form.Control>
                            </Form.Group>
                            <Button type="submit">Buscar</Button>
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
}

export default SearchForm;