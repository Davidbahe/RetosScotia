const { delay, tareaAsincrona, retoDos} = require('./retoDos');

jest.useFakeTimers(); 

afterEach(()=>{
    jest.restoreAllMocks();
});

describe('Prueba para el delay', () =>{
test('debe dar el resultado despues del tiempo dado', async() =>{
    const promise = delay(5000);
    
    jest.advanceTimersByTime(5000);
    await expect(promise).resolves.toBeUndefined(); 

    });
});

describe('Pruebas para tareaAsincrona', () =>{
    test('debe ejecutarse y mostrar los mensajes en orden', async () =>{
        const consoleSpy = jest.spyOn(console,'log');
        const promise = tareaAsincrona(); 

        expect(consoleSpy).toHaveBeenCalledWith('Tarea ejecutandose en segundo plano');
        jest.advanceTimersByTime(5000);

        await promise; 

        expect(consoleSpy).toHaveBeenCalledWith('Proceso en backend completado');
    });
});

describe('Prueba para retoDos',() => {
    test('debe ejecutar tareaAsincrona y mostrar en orden los mensajes', async () =>{
        const consoleSpy = jest.spyOn(console,'log');
        const promise = retoDos(); 

        expect(consoleSpy).toHaveBeenNthCalledWith(1, 'Antes de llamar a la función');
        expect(consoleSpy).toHaveBeenNthCalledWith(2, 'Tarea ejecutandose en segundo plano');
        jest.advanceTimersByTime(5000);

        await promise;

        expect(consoleSpy).toHaveBeenNthCalledWith(3, 'Proceso en backend completado');
        expect(consoleSpy).toHaveBeenNthCalledWith(4, 'Después de llamar a la función');
        expect(consoleSpy).toHaveBeenCalledTimes(4);
    });
});
