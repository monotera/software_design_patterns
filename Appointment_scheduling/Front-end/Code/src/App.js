import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css"; //Importar bootstrap
import MenuPage from "./pages/MenuPage";
import RecordFormPage from "./pages/RecordFormPage";
import SearchFormPage from "./pages/SearchFormPage";
import ErrorPage from './pages/ErrorPage';

function App() {
  return (
    <Router>
      <Routes>
          <Route path="/" element={<MenuPage/>} /> {/*De esta forma se indica que la página principal es MenuPage */}
          <Route path="/recordForm" element={<RecordFormPage/>} />
          <Route path="/searchForm" element={<SearchFormPage/>} />
          <Route path="*" element={<ErrorPage/>} /> {/*De esta forma se indica la página que aparece cuando se ingresa por el uri un recurso que no existe (SIEMPRE DEBE SER EL ULTIMO Route)*/}
      </Routes>
    </Router>
  );
}

export default App;
