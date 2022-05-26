select 
    region as 'Região',
    sum(populacao) as 'Total'
from estados
group by region
order by Total desc;

// media de habitantes por estados
select
    avg(populacao) as 'Media'
from `estados`;