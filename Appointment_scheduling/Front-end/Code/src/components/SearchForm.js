import {Button, Card, Form} from "react-bootstrap";

const SearchForm = () => {
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
                    </Card.Body>
                </Card>
            </header>
        </div>
    );
}

export default SearchForm;