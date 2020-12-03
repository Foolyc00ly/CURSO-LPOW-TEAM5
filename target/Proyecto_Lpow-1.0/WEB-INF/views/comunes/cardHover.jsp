<%
    String nombre = request.getParameter("nombre");
    String img = request.getParameter("img");
%>
<div class="w-1/3">
    <div class="max-w-sm rounded overflow-hidden shadow-lg">
        
        <img class="w-full" src="assets/productos/<%=img%>.png" alt="Sunset in the mountains">
        <div class="px-6 py-4">
            <div class="font-bold text-xl mb-2"><%=nombre%></div>
            <p class="text-gray-700 text-base">
                
            </p>
        </div>
  <div class="flex justify-end px-6 py-4">
    <button
      class="bg-transparent hover:bg-blue-500 text-blue-700 font-semibold hover:text-white py-2 px-4 border border-blue-500 hover:border-transparent rounded">
      Registrar
    </button>
  </div>
    </div>
</div>
<%-- <img class="w-full" src="https://source.unsplash.com/400x200/?nature" alt="Sunset in the mountains"> --%>

