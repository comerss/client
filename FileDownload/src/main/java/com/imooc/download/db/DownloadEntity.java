package com.imooc.download.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "DOWNLOAD_ENTITY".
 */
public class DownloadEntity {

    private Long start_position;
    private Long end_position;
    private Long progress_position;
    private String download_url;
    private Integer thread_id;
    private Long id;

    public DownloadEntity() {
    }

    public DownloadEntity(Long id) {
        this.id = id;
    }

    public DownloadEntity(Long start_position, Long end_position, Long progress_position, String download_url, Integer thread_id, Long id) {
        this.start_position = start_position;
        this.end_position = end_position;
        this.progress_position = progress_position;
        this.download_url = download_url;
        this.thread_id = thread_id;
        this.id = id;
    }

    public Long getStart_position() {
        return start_position;
    }

    public void setStart_position(Long start_position) {
        this.start_position = start_position;
    }

    public Long getEnd_position() {
        return end_position;
    }

    public void setEnd_position(Long end_position) {
        this.end_position = end_position;
    }

    public Long getProgress_position() {
        return progress_position;
    }

    public void setProgress_position(Long progress_position) {
        this.progress_position = progress_position;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public Integer getThread_id() {
        return thread_id;
    }

    public void setThread_id(Integer thread_id) {
        this.thread_id = thread_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
