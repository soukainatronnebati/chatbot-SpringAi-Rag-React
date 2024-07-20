import {Button, TextField} from "@vaadin/react-components";
import {useState} from "react";
import {ChatAiService} from "Frontend/generated/endpoints";
import Markdown from "react-markdown";

export default function Chat() {
    //usestate permet de creer objet dans laquel on a variable question et une methode setQuestion permet changer cette variable
    const [question,setQuestion] = useState<string>("");
    const [response,setresponse] = useState<string>("");

    async function send(){
        ChatAiService.ragChat(question).then(resp=> {
            setresponse(resp);
        });

    }
    return(
      <div className="p-m">
          <h3>Chat Bot</h3>
          <div>
              <TextField style={{width:'80%'}}
                         onChange={e=>setQuestion(e.target.value)}/>
              <Button theme="primary" onClick={send}>Send</Button>
              <div>
                  <Markdown>
                       {response}
                  </Markdown>

              </div>
          </div>
      </div>
    );
}