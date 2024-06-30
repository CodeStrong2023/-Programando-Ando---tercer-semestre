<h1 align="center">💻 Programando Ando - Tercer Semestre 💻</h1>

<p align="center">
  <img src="https://github.com/CodeStrong2023/Programando-Ando-Segundo-Semestre/assets/132927111/64de069f-8c71-4a0c-a9fe-6f36b8bb3ec4" alt="Programando Ando Logo" width="440px">
</p>

<h2>👥 Miembros</h2>
<table>
  <tr>
    <th>Alumno</th>
    <th>Nº Legajo</th>
    <th>GitHub</th>
  </tr>
  <tr>
    <td>Uriel Pardo</td>
    <td>10.462</td>
    <td><a href="https://github.com/UrielPardo" target="_blank">GitHub de Uriel</a></td>
  </tr>
  <tr>
    <td>Alexis Perez</td>
    <td>8.707</td>
    <td><a href="https://github.com/Alitoo27" target="_blank">GitHub de Alexis</a></td>
  </tr>
  <tr>
    <td>Ezequiel Lorenz</td>
    <td>10.426</td>
    <td><a href="https://github.com/ezelorenz" target="_blank">GitHub de Ezequiel</a></td>
  </tr>
  <tr>
    <td>Mauro Mesas</td>
    <td>10.442</td>
    <td><a href="https://github.com/mauromesas" target="_blank">GitHub de Mauro</a></td>
  </tr>
  <tr>
    <td>Tahiel Inostroza</td>
    <td>10.412</td>
    <td><a href="https://github.com/tahiel-14" target="_blank">GitHub de Tahiel</a></td>
  </tr>
</table>

<h2>📋 Cómo trabajar de manera organizada con Scrum</h2>

<h3>Ejemplo de flujo de trabajo:</h3>

<h4>1. Clonar el repositorio:</h4>
<pre>
<code>
git clone https://github.com/CodeStrong2023/-Programando-Ando---tercer-semestre.git
</code>
</pre>

<h4>2. Si ya tienes descargado el repositorio, actualiza la rama <code>main</code>:</h4>
<pre>
<code>
git checkout main
git pull origin main
</code>
</pre>

<h4>3. Crear una rama basada en <code>main</code>:</h4>
<pre>
<code>
git checkout -b Jun10-14
</code>
</pre>

<h4>4. Después de cada desarrollo que realices y funcione, ejecuta los siguientes comandos:</h4>
<pre>
<code>
git add .
git commit -m "Mensaje del commit"
</code>
</pre>

<h4>5. Al finalizar la semana (por ejemplo, Viernes), realiza tus últimos cambios, agrégalos al stage y haz el commit necesario:</h4>
<pre>
<code>
git add .
git commit -m "Mensaje final de la semana"
</code>
</pre>

<h4>6. Empuja tus cambios al repositorio remoto:</h4>
<pre>
<code>
git push
</code>
</pre>

<h4>7. Si aparece un error similar al siguiente:</h4>
<pre>
<code>
fatal: The current branch Jun10-14 has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin Jun10-14
</code>
</pre>

<h4>8. Ejecuta el comando sugerido:</h4>
<pre>
<code>
git push --set-upstream origin Jun10-14
</code>
</pre>

<h4>9. Una vez que tu rama esté actualizada en GitHub, ve a la sección de Pull Requests y crea uno nuevo, comparando la rama <code>main</code> con la que acabas de subir.</h4>

<p>¡Listo! Ahora solo queda esperar que se apruebe tu Pull Request para fusionar tus cambios.</p>
