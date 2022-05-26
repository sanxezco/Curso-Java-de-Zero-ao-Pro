select nome, region, sigla as 'Siglas dos Estados' from estados
where region = 'Norte'

select nome, region, populacao from estados
where populacao >= 10

select * from estados