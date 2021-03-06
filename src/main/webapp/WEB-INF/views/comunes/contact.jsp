<div class="bg-gray-100 mx-auto max-w-6xl bg-white py-20 px-12 lg:px-24 shadow-xl mb-24">
    <form action="${pageContext.request.contextPath}/ServletControlador?opts=enviar" method="post">
        <div class="bg-white shadow-md rounded px-8 pt-6 pb-8 mb-4 flex flex-col">
            <div class="-mx-3 md:flex mb-6">
                <div class="md:w-1/2 px-3 mb-6 md:mb-0">
                    <label class="uppercase tracking-wide text-black text-xs font-bold mb-2" for="nombre">
                        Tu Nombre*
                    </label>
                    <input class="w-full bg-gray-200 text-black border border-gray-200 rounded py-3 px-4 mb-3" name="nombre" id="nombre" type="text" placeholder="Escriba su nombre..." required>

                </div>
                <div class="md:w-1/2 px-3">
                    <label class="uppercase tracking-wide text-black text-xs font-bold mb-2" for="email">
                        Tu Email*
                    </label>
                    <input class="w-full bg-gray-200 text-black border border-gray-200 rounded py-3 px-4 mb-3" name="email" id="email" type="email" placeholder="Escriba su Email..." required>
                </div>
            </div>
            <div class="-mx-3 md:flex mb-6">
                <div class="md:w-full px-3">
                    <label class="uppercase tracking-wide text-black text-xs font-bold mb-2" for="asunto">
                        Asunto*
                    </label>
                    <input class="w-full bg-gray-200 text-black border border-gray-200 rounded py-3 px-4 mb-3" name="asunto" id="asunto" type="text" placeholder="Escriba su asunto...." required>
                </div>
            </div>
            <div class="-mx-3 md:flex mb-2">
                <div class="md:w-full px-3">
                    <label class="uppercase tracking-wide text-black text-xs font-bold mb-2" for="sugerencia">
                        Sugerencia*
                    </label>
                    <input class="w-full bg-gray-200 text-black border border-gray-200 rounded py-3 px-4 mb-3" name="sugerencia"  id="sugerencia" type="text" placeholder="Escribe tu mensaje...." required>
                </div>

            </div>
            <div class="-mx-3 md:flex mt-2">
                <div class="md:w-full px-3">
                    <button class="md:w-full bg-gray-900 text-white font-bold py-2 px-4 border-b-4 hover:border-b-2 border-gray-500 hover:border-gray-100 rounded-full">
                        Enviar
                    </button>
                </div>
            </div>
        </div>
    </form>
</div>