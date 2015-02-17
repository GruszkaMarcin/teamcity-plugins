/**
 * Copyright 2014 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.arcbees.vcs.github.model;

import com.arcbees.vcs.model.Comment;
import com.google.gson.annotations.SerializedName;

public class GitHubComment implements Comment {
    @SerializedName("id")
    private Long commentId;

    @Override
    public Long getCommentId() {
        return commentId;
    }

    @Override
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }
}