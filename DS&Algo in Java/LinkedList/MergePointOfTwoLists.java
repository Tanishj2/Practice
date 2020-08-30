 static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode current1 = head1;
        SinglyLinkedListNode current2 = head2;
        
        if (current1 == null || current2 == null ) 
        return -1;
        
        while(current1!=current2 && current1!=null && current2!=null)
        {
                //if we reach at the end then merge the head2 
                if(current1.next == null)
                    current1 = head2;
                current1 = current1.next;
                //head2
                if(current2.next == null)
                    current2 =head1;  
                current2= current2.next;
                //if we find intersection point
                if(current1 == current2)
                    return current1.data;
        }
        return current2.data;
    }
