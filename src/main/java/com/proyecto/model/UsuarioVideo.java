package com.proyecto.model;

import java.util.List;

public class UsuarioVideo {
    private Usuario usuario;
    private List<Video> videos;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
