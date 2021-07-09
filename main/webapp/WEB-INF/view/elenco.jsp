<%@page import="java.util.List"%>
<%@page import="com.generation.biblioteca.entities.Libro"%>
<%@ include file="header.jsp"%>

    <!-- ciclare una lista di libri e mostrare una tabella html, ogni titolo porterá al dettaglio.jsp del libro -->

    <a href="/index.html">Home</a>
    <a href="/aggiungiLibro.html">Aggiungi Libro</a>

    <h1>Elenco Libri</h1>

    <table id="elenco">
        <tr>
            <th>Titolo</th>
            <th>Editore</th>
        </tr>

        <% for(Libro l : (List<Libro>) request.getAttribute("libri")) {%>
        <tr>
            <td><a href="/mvc/libri/<%= l.getId() %>"><%= l.getTitolo() %></a></td>
            <td><%= l.getPrezzo() %></td>
        </tr>
        <%} %>

    </table>

<%@ include file="footer.jsp"%>