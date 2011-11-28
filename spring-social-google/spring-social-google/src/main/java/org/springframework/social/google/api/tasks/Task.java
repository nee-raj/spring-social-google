/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.google.api.tasks;

import static org.springframework.social.google.api.tasks.TaskStatus.COMPLETED;
import static org.springframework.social.google.api.tasks.TaskStatus.NEEDS_ACTION;

import java.util.Date;

import org.springframework.social.google.api.ApiEntity;

/**
 * Model class representing a task
 * @author Gabriel Axel
 */
public class Task extends ApiEntity {

	private String title;
	private String notes;
	private Date due;
	private String parent;
	private String position;
	private Date updated;
	private TaskStatus status;
	private Date completed;

	public Task() {
		
	}
	
	public Task(String id) {
		super(id);
	}
	
	public Task(String id, String title, String notes, Date due, Date completed) {
		super(id);
		this.title = title;
		this.notes = notes;
		this.due = due;
		setCompleted(completed);
	}
	
	public Task(String title, String notes, Date due, Date completed) {
		this(null, title, notes, due, completed);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getDue() {
		return due;
	}

	public void setDue(Date due) {
		this.due = due;
	}

	public String getParent() {
		return parent;
	}

	public String getPosition() {
		return position;
	}

	public Date getUpdated() {
		return updated;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public Date getCompleted() {
		return completed;
	}

	public void setCompleted(Date completed) {
		this.completed = completed;
		status = completed == null ? NEEDS_ACTION : COMPLETED;
	}
	
	
	
}
