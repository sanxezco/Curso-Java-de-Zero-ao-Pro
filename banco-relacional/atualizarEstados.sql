update estados
set nome = 'Maranhão'
where sigla = 'MA';

select nome from estados where sigla = 'MA';

update Estados
set nome = 'Paraná',
    populacao = 11.32
where sigla = 'PR';

select * from estados

-- inserir dados tabela estados
insert into estados (sigla, nome, populacao)
values ('SP', 'São Paulo', 12.32);


-- funcion que recoja dos parametros

