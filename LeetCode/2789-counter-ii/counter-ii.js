/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    const initial=init;
    function increment(){
        init+=1;
        return init;
    }
    function decrement(){
        init-=1;
        return init;
    }
    function reset(){
        init = initial;
        return init;
    }

    return {increment, decrement, reset}
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */