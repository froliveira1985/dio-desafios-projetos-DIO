"use strict";
const sarah = {
    name: 'Sarah',
    idade: 26,
    casado: true,
    trabalho: 'Engenheira' // Nesse campo é dito que a sarah trabalha como 'Engenheira'
};
const maria = {
    name: 'Maria',
    idade: 23,
    casado: false,
    trabalho: 'engenheira' // E aqui é dito que maria trabalha como 'engenheira'.
};
// Isso está correto? Existe diferença entre 'Engenheira' e 'engenheira'? Acredito que não. Isso deve ter sido um erro cometido em desenvolvimento.
// Para resolver isso vamos usar a feature Enum do TypeScript para criar o enum Profissao
var Profissao;
(function (Profissao) {
    Profissao[Profissao["Professor"] = 0] = "Professor";
    Profissao[Profissao["Engenheiro"] = 1] = "Engenheiro";
    Profissao[Profissao["Pintor"] = 2] = "Pintor";
    Profissao[Profissao["Porteiro"] = 3] = "Porteiro";
})(Profissao || (Profissao = {}));
const gabriel = {
    name: 'Gabriel',
    idade: 26,
    casado: false,
    trabalho: Profissao.Engenheiro // E aqui usamos ele para definir de forma padronizada a profissão de cada objeto do tipo Pessoa
};
const mario = {
    name: 'Mario',
    idade: 26,
    casado: false,
    trabalho: Profissao.Engenheiro // Tudo padronizado e consistente
};
