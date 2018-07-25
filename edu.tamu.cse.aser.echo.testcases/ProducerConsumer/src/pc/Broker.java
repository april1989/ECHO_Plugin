package pc;
/*******************************************************************************
 * Copyright 2011 @ Kapil Viren Ahuja
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/


//import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

import jdk.LinkedList;

public class Broker
{
//    public ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(100);
	public LinkedList<Integer> queue = new LinkedList<>();
    public Boolean continueProducing = Boolean.TRUE;

    public void put(Integer data) throws InterruptedException
    {
//        this.queue.put(data);
    	this.queue.add(data);
    }

    public Integer get() throws InterruptedException
    {
//        return this.queue.poll(1, TimeUnit.SECONDS);
    	return this.queue.pollFirst();
    }
}
