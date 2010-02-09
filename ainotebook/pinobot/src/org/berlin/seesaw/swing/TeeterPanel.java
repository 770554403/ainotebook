/**
 * Copyright (c) 2006-2010 Berlin Brown and botnode.com/Berlin Research  All Rights Reserved
 *
 * http://www.opensource.org/licenses/bsd-license.php

 * All rights reserved.

 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:

 * * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * * Neither the name of the Botnode.com (Berlin Brown) nor
 * the names of its contributors may be used to endorse or promote
 * products derived from this software without specific prior written permission.

 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * Date: 2/15/2010 
 *   
 * Home Page: http://botnode.com/
 * 
 * Description: Seesaw (Teeter Totter) Swing Framework
 * 
 * Contact: Berlin Brown <berlin dot brown at gmail.com>
 */
package org.berlin.seesaw.swing;

import javax.swing.JPanel;

import org.berlin.seesaw.swing.layout.ITeeterLayout;


/**
 */
public abstract class TeeterPanel implements ITeeterPanel {
   
    private final ITeeterLayout layout;    
    private final JPanel panel;
    
    /**
     * Constructor for TeeterPanel.
     * @param panel JPanel
     * @param layout ITeeterLayout
     */
    public TeeterPanel(final JPanel panel, final ITeeterLayout layout) {
        this.panel = panel;
        this.layout = layout;
    }
        
    /**
     * Method addButton.
     * @param button ITeeterButton
     * @see org.berlin.seesaw.swing.ITeeterPanel#addButton(ITeeterButton)
     */
    public void addButton(ITeeterButton button) {     
        
    }
    
    /**
     * Method addTextArea.
     * @param text ITeeterTextArea
     * @see org.berlin.seesaw.swing.ITeeterPanel#addTextArea(ITeeterTextArea)
     */
    public void addTextArea(ITeeterTextArea text) {
        
    }
    
    /**
     * Method toString.
     * @return String
     */
    public String toString() {
        return String.format("#{TeeterPanel: %s}", this.layout);
    }
    
    
    /**
     * @return the layout
     * @see org.berlin.seesaw.swing.ITeeterPanel#getLayout()
     */
    public ITeeterLayout getLayout() {
        return layout;
    }

    /**
     * @return the panel
     * @see org.berlin.seesaw.swing.ITeeterPanel#getComponent()
     */
    public JPanel getComponent() {
        return panel;
    }    
    
} // End of the Class //
