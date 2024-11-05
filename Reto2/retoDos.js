const delay = (ms) => new Promise(resolve => setTimeout(resolve, ms));

const tareaAsincrona = async () => {
    console.log('Tarea ejecutandose en segundo plano');
    await delay(5000);
    console.log('Proceso en backend completado');
};

const retoDos = async () => {
    console.log('Antes de llamar a la función');
    await tareaAsincrona();
    console.log('Después de llamar a la función');
};

retoDos(); 

//module.exports = {delay, tareaAsincrona, retoDos};