class Button {
    constructor(value) {
      //alert("masuk construct")
      console.log("masuk construct")
      this.value = value;
    }
  
    click() {
      console.log("masuk click")
      console.log(this.value);
    }
  }
  
  let button = new Button("hello");
  
  setTimeout(button.click, 1000); // undefined

  