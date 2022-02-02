import {Button, Card} from "react-bootstrap";
import {useNavigate} from "react-router-dom";

const Menu = () => {
    let navigate = useNavigate(); {/* Para navegar a otro recurso interactuando con algún elemento de la página */}
    return (
        <div className="App">
            <header className="App-header">
                <Card>
                    <div className="text-center">
                        <Card.Img className="App-image" src="https://www.esic.edu/sites/default/files/styles/full/public/rethink/3e0af5ef-call-center-contact-center.jpg?itok=Vo4yxgfD"/>
                    </div>
                    <Card.Body>
                        <Card.Title>Menú de citas</Card.Title>
                        <Card.Text>Este es el menú del agendamiento de citas, porfavor escoja una de las siguentes dos opciones:</Card.Text>
                        <Button onClick={() => {navigate("/recordForm")}}>Agendar</Button> {/* Evento onClick que navega a otro recurso cuando se le hace click al botón */}
                        <Button onClick={() => {navigate("/searchForm")}}>Buscar</Button> {/* Evento onClick que navega a otro recurso cuando se le hace click al botón */}
                    </Card.Body>
                </Card>
            </header>
        </div>
    );
}

export default Menu;