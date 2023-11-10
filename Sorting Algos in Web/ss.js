const inptag = document.getElementById("inp");
let working = new Boolean(false);

function sort() {
    // checking if the input tag is empty if so then we alert the user else perform the actions
    if (inptag.value.trim() === "") {
        alert("Enter elements of an array..");
        working = false;
        // console.log("not working");
        // return will help us to hold the iterator to move to next line.
        return;
    }
    // here we will check if the output feild is empty or not so that next time we don't accidently override the output, or get unwanted output.
    if (document.getElementById("outputBox").innerHTML !== "") {
        document.getElementById("outputBox").innerHTML = "";
    }
    // now create a constant to take iterations speed as input
    const itr_speed = document.getElementById("speed").value;
    if (parseInt(itr_speed) > 1500) {
        alert("Can not have speed greater than 1.5 seconds.");
        return;
    }
    // the working variable will help us in having control over the interval, so that previous/current intervals can be cleared
    working = !working;

    // now let's start coding the selection sort
    // declare necessary variables
    let min = 0;
    let first = 0;
    // we will store input array in elem.
    let elem = inptag.value.split(" ");
    let len = elem.length;

    // now we do type conversion
    for (i = 0; i < len; i++) {
        elem[i] = parseInt(elem[i]);
    }
    // console.log("error");
    // now create an interval
    let interval = setInterval(()=>{
        // first check if the user pressed the button again while iteration is in process
        if (working == true){
            clearInterval(interval);
            return ;
        }

        // create a loop to find the minimum element's index
        for (i = first + 1; i < len; i++){
            if ( elem[i] < elem[min]){
                min = i;
            }
        }

        // check if the first variable reached end of array 
        // which means first loop has ended
        if ( first == len - 1 ){
            document.getElementByid("outputBox").innerHTML = elem;
            clearInterval(interval);
        }
        else{
            // else we will continue on performing the process
            // after the above loop ends we will get the min index of minimum element in the array.
            // so we now perform swap operation
            let temp = elem[min];
            elem[min] = elem[first];
            elem[first] = temp;
            // now update the output element
            document.getElementById("outputBox").innerHTML = elem;
            // after updating, we will increment the variable 'first'
            // and re-initialize the 'min' variable.
            // which will set them for next iteration
            // and if the variable 'first' reaches it's end then the loop ends and this else part will not be executed
            // also the interval will be cleared i.e in the above if condition
            first+=1;
            min = first;
        }
    }, itr_speed);
}