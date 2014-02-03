/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgijsber.webblog.dao;

import java.util.List;
import com.sgijsber.webblog.model.Posting;

public interface PostingDao {

    void create(Posting p);

    List<Posting> findAll();

    Posting find(Long id);
}