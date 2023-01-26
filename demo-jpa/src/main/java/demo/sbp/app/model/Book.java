/*
 * Copyright (C) 2019-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package demo.sbp.app.model;

import javax.persistence.*;

/**
 * @author <a href="https://github.com/hank-cp">Hank CP</a>
 */
@Entity
@Table(name = "Book", schema = "demo_app")
public class Book extends demo.sbp.api.model.Book {

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return super.getId();
    }

    @Override
    @Column(unique = true, nullable = false)
    public String getName() {
        return super.getName();
    }
}
