<%@ include file="header.jsp"%>

	<a href="/index.html">Home</a>
	<a href="/mvc/libri">Elenco</a>

    <h1>Dettaglio Libro</h1>

	<div id="dettagli">

		<h2>Titolo : ${libro.titolo}</h2>
		<p>Pagine: ${libro.pagine}</p>
		<p>Editore: ${libro.editore_id}</p>
		<p>Prezzo Iva: ${libro.prezzo_iva}</p>
		<p>Prezzo: ${libro.prezzo}</p>






	</div>


<%@ include file="footer.jsp"%>